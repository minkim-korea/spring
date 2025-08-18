
public class J0818_01 {
 public static void main(String[] args) {
	System.out.println("안녕하세요.");
	
//	User2 user2 =new User2();
//	user2.setId("aaa");
//	System.out.println(user2.getId());
	
	User user =new User();
	user.getNo();
	
	User2 user2 =new User2();
	user2.getNo();
		
	
	//다형성 : 부모의 참조변수로 자손의 객체를 다루는것 
	IUser iUser =new User2();
    iUser.getNo();
    
 
 }   
}
