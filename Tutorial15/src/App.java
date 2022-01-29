
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree; //this is polymorphism
		
		plant2.grow();
		
		tree.shedLeaves();
		doGrow(tree);
		
	}
    public static void doGrow(Plant plant) {
    	plant.grow();
    }
}
