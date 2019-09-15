//
public class SuperTour<U,T>
{
	U name;
	T price;

	public SuperTour( U name, T price) {
		this.name = name;
		this.price = price;
	}

	public U getName() {
		return name;
	}

	public void setName( U name) {
		this.name = name;
	}

	public T getPrice() {
		return price;
	}

	public void setPrice( T price) {
		this.price = price;
	}

	@Override
	public String toString()  {
		return "Name =  "  +  name +  ", price =  $" +  price +   '\n';
	}

}// end of class Tour
