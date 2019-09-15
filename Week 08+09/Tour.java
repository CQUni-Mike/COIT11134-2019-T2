//
public class Tour<T>
{
	String name;
	T price;

	public Tour( String name, T price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName( String name) {
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
