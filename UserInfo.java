import jakarta.persistence.Entity;
improt jakarta.persistence.Id;
import lombok.Entity;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserInfo{
	@Id
	private int userid;
	private	String name;
	private String email;
	private String password;

	
}