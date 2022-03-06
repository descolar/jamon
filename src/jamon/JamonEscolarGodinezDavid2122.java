/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
/**
 * Clase abstracta para representar un jamón.
 */
public class JamonEscolarGodinezDavid2122 {

    /**
     * Categoría del jamón.
     */
    private String categoria;
    /**
     * Precio del jamón.
     */
    private double precio;
    /**
     * Meses de curación del jamón.
     */
    private int mesesCuracion;
    /**
     * Stock actual del jamón.
     */
    private int stock;

    /**
     *
     * Metodo constructor por defecto sin argumentos
     *
     */
    public JamonEscolarGodinezDavid2122() {
    }

    /**
     *
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     *
     * @param cat Categoria del jamón
     * @param precio Precio del jamón
     * @param stock Stock inicial del jamón
     *
     */
    public JamonEscolarGodinezDavid2122(String cat, double precio, int stock) {
        this.categoria = cat;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     *
     * Método para asignar la categoría del jamón
     *
     * @param cat Categoria del jamón
     *
     */
    public void asignarCategoria(String cat) {
        setCategoria(cat);
    }

    // Método que me devuelve la categoría del jamón
    public String obtenerCategoria() {
        return getCategoria();
    }

    /**
     *
     * Método que me devuelve el stock de jamones disponible en cada momento
     *
     * @return Devuelve stock actual de jamones en ese momento
     *
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     *
     * Método para comprar jamones. Modifica el stock Este método va a ser
     * probado con Junit
     *
     * @param cantidad Cantidad de jamones a comprar
     * @throws Exception Si cantidad de jamones a comprar es inferior a 0
     *
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de jamones");
        }
        setStock(getStock() + cantidad);
    }

    /**
     *
     * Método para vender jamones. Modifica el stock Este método va a ser
     * probado con Junit
     *
     * @param cantidad Cantidad de jamones a vender
     * @throws Exception Si cantidad de jamones a vender es inferior a 0
     * @throws Exception Si cantidad de jamones a vender supera stock actual
     *
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de jamones");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No  hay suficientes jamones para vender");
        }
        setStock(getStock() - cantidad);
    }

    /**
     * Getter Devuelve la categoria del jamón
     *
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Setter Establece la categoria del jamón
     *
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Getter Devuelve el precio del jamón
     *
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter Establece el precio del jamón
     *
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getter Devuelve los meses de curación
     *
     * @return the mesesCuracion
     */
    public int getMesesCuracion() {
        return mesesCuracion;
    }

    /**
     * Setter Establece los meses de curación del jamón
     *
     * @param mesesCuracion the mesesCuracion to set
     */
    public void setMesesCuracion(int mesesCuracion) {
        this.mesesCuracion = mesesCuracion;
    }

    /**
     * Getter Devuelve el stock
     *
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Setter Establece el valor del stock
     *
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
