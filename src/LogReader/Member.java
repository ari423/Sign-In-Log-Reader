//Ari Meles-Braverman

package LogReader;

public class Member {

	public String name, code;
	
	public Member(String name, String code){
		this.name = name;
		this.code = code;
	}
	
	public Member(){
		this("","");
	}
	
	public Member(Member member){
		this(member.name, member.code);
	}
	
	public boolean check(String code){
		return code.equals(this.code);
	}
	
	public String toString(){
		return "{" + name + " : " + code + "}";
	}
}
