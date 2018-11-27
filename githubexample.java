import java.util.ArrayList;
public class githubexample{
	public static ArrayList<Integer> combine(ArrayList<Integer> s, ArrayList<Integer> t){
		ArrayList<Integer> n = new ArrayList<>();
		for(int i = 0;i < s.size(); i++){
			n.add(s.get(i));
		}
		for(int i = 0;i < t.size(); i++){
			n.add(t.get(i));
		}
		return n;
	}
	public static void print(ArrayList<Integer> p){
		for(int i = 0; i < p.size(); i++){
			System.out.print(p.get(i)+", ");
		}
		System.out.println();
	}
	public static void main(String[] args){

	}
}