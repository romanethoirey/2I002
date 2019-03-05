public class RobotIdiot {
	private int i; 
	private int j;
	private id;
	
	public RobotIdiot(int x, int y) {
		super(x,y);
	}
	
	public void move (Monde m){
		int di = Math.random()*m.getTaille()%m.getTaille();
		int dj = Math.random()*m.getTaille()%m.getTaille();
		for(int i=0;i<robot.size();i++){
		
			if((robot.getI()!=di)&&(robot.getJ()!=dj){
			
				robot.move(di,dj);
			}
		}
	}
	
	public void action(Monde m){
		
	}
}
