package com.yasmin.springboot.projectsrestful.webservices;

import java.sql.Date;

import javax.validation.constraints.Size;

public class User 
{

	
	private Integer id;
	
	@Size(max = 10, message="Maximum size is 10")
	private String name;
	
	/* Sample 
	 * 
	 * 
	@NotNull
	@Size(min=2, max=30)
	private String name;

	@NotNull
	@Min(18)
	private Integer age;
	
	@NotBlank(message = "Name is mandatory")
    private String name;
     
    @NotBlank(message = "Email is mandatory")
    private String email;
        @NotEmpty(message = "Please provide a name")
    private String name;

    @NotEmpty(message = "Please provide a author")
    private String author;

    @NotNull(message = "Please provide a price")
    @DecimalMin("1.00")
    
    
    @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$")
  	private String ipAddress;
    
    
    @Null(groups = OnCreate.class)          //This will make sure that the ID is empty in our “Create” use case and that it’s not empty in our “Update” use case.
    @NotNull(groups = OnUpdate.class)
  	private Long id;
  
  	 
  
    Annotation	Description
	@NotNull	It determines that the value can't be null.
	@Min		It determines that the number must be equal or greater than the specified value.
	@Max		It determines that the number must be equal or less than the specified value.
	@Size	It determines that the size must be equal to the specified value.
	@Pattern	It determines that the sequence follows the specified regular expression.



	 * 
	 * 
	 * 
	 */

public User(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + "]";
}
 

	
}
