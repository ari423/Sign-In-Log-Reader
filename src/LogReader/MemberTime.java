//Ari Meles-Braverman

package LogReader;

public class MemberTime extends Member{

	public double time;
	
	public MemberTime(String name, String code, double time){
		super(name, code);
		this.time = time;
	}
	
	public MemberTime(Member member, double time){
		super(member);
		this.time = time;
	}
	
	public double addTime(double add){
		time += add;
		return time;
	}
	
}
