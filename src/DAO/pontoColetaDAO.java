package DAO;

import entity.CollectPoint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utils.Conexao;

/* private final Double latitude;
    private final Double longitute;
    private final String nome;
    private final String email;
    private final String cidade;
    private final String tipoResiduo;
    private int id;*/
public class pontoColetaDAO {

    public static void pontoColetaDAO(CollectPoint coleta) {             
        
        String sql = "INSERT INTO ecoleta (nome, email, cidade, tipoResiduo, latitude, longitude) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement stm = Conexao.getConexao().prepareStatement(sql)) {

            stm.setString(1, coleta.getNome());
            stm.setString(2, coleta.getEmail());
            stm.setString(3, coleta.getCidade());
            stm.setObject(4, coleta.getTipoResiduo());
            stm.setDouble(5, coleta.getLatitude());
            stm.setDouble(6, coleta.getLongitute());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido no banco");
        } catch (SQLException e) {
            System.out.println(e);

            JOptionPane.showMessageDialog(null, "Problema no insert " + e);
        }
    }
}



