package object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OperacionesCrud {

    private Connection conexion;

    public OperacionesCrud(Connection conexion) {
        this.conexion = conexion;
    }

    public Map<Integer, Cliente> getHashMapClientes() {
        Map<Integer, Cliente> clientes_hm = new HashMap<>();
        String query = "SELECT * FROM Cliente";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                String domicilio = rs.getString("domicilio");
                Cliente c = new Cliente(codigo, nombre, domicilio);
                clientes_hm.put(c.getCodigo(), c);
            }
        } catch (Exception e) {
            clientes_hm = null;
        }
        return clientes_hm;
    }



}
