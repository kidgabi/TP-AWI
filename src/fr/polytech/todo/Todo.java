package fr.polytech.todo;

public class Todo {
	long id;
	String name;
	String description;
	
	
	
	public Todo(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString(){
		return ("["+id+"] "+name+" : "+description);
		
	}
	
	public static void main(String[] args){
		Todo todo = new Todo(1, "test", "blabla");
		System.out.println(todo.toString());
		
	}

}
