package pregunta1;
public class orden {
	public double precioTotal(double precio, double descuento) {
		double descuentoPrecio = precio - descuento;
		double precioImpuesto = descuentoPrecio + (descuentoPrecio * 0.1);
		return precioImpuesto;
	}
}