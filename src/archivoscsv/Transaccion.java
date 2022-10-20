package archivoscsv;

public class Transaccion {

    // VARIABLES DE INSTANCIA
    private int idTransaccion;
    private String ciudad;
    private String zona;
    private double ventas;
    private String formaPago;
    private String categoria;

    // CONSTRUCTORES
    public Transaccion() {
    }

    public Transaccion(int idTransaccion, String ciudad, String zona, double ventas, String formaPago, String categoria) {
        this.idTransaccion = idTransaccion;
        this.ciudad = ciudad;
        this.zona = zona;
        this.ventas = ventas;
        this.formaPago = formaPago;
        this.categoria = categoria;
    }

    // METODOS SET Y GET
    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "idTransaccion=" + idTransaccion + ", ciudad=" + ciudad + ", zona=" + zona + ", ventas=" + ventas + ", formaPago=" + formaPago + ", categoria=" + categoria + '}';
    }

    public static void cabecera() {
        System.out.printf("%-14s    %-10s    %-5s    %-7s    %-14s   %-10s\n", "IDTRANSACCION", "CIUDAD", "ZONA", "VENTAS", "FORMA DE PAGO", "CATEGORIA");
        System.out.printf("%-14s    %-10s    %-5s    %-7s    %-14s   %-10s\n", "-------------", "------", "----", "------", "-------------", "---------");
    }

    public void cuerpo() {
        System.out.printf("%14d    %-10s    %-5s    %7.2f    %-14s   %-10s\n", this.idTransaccion, this.ciudad, this.zona, this.ventas, this.formaPago, this.categoria);
    }

}
