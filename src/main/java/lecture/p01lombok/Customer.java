package lecture.p01lombok;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer {
	private int id;
	private String name;
	private String city;
	private String address;
	
}
