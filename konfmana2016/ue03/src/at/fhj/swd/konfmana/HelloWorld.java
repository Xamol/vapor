package at.fhj.swd.konfmana;

/**
 * a simple hello world class
 * @author cschindler
 *
 */
public class HelloWorld {

	private String name=null;

	/**
	 * constructor initializing the name
	 * @param name to be initialized
	 */
	public HelloWorld(String name){
		setName(name);
	}
	
	/**
	 * default constructor
	 */
	public HelloWorld(){
		setName(null);
	}
	
	/**
	 * returns the name which appears in the hello world greetings when set
	 * @return the name 
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name which appear in the hello world greetings
	 * @param name to be set
	 */
	public void setName(String name) {
		if (name!=null){
			this.name = name.trim();
		} else {
			this.name = null;
		}
	}
	
	@Override
	public String toString(){
		if (name==null||name.isEmpty()){
			return "Hello World!";
		} else {
			return "Hello World! Hello "+name+"!";
		}
		
	}
	
}
