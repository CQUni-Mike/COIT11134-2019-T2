public class BuildingDevelopmentApplication {
    // create instance fields to store the values of plot width
    // and length; building width and length
    // complete the missing block of codes

    double plotLength;
    double plotWidth;
    double buildingLength;
    double buildingWidth;

    boolean approved = false;

    public BuildingDevelopmentApplication(double plotLength, double plotWidth, double buildingLength, double buildingWidth) {
        // complete the missing block of codes
		this.plotLength     = plotLength;
		this.plotWidth      = plotWidth;
		this.buildingLength = buildingLength;
		this.buildingWidth  = buildingWidth;
    }

    // inner class to verify the building plan adheres to front, rear and sides clearance
    class Verification{
        boolean objection ;
        private static final double MINIMUMREQUIRED = 2;

        public Verification() {
            objection = false;
        }

        //to verify the building plan adhers to front,
        // rear and sides clearance
        boolean check(){
            if(checkWidth() && checkLength())
                return true;
            return false;

        }
        boolean checkWidth(){
            // complete the missing block of codes
            //plotWidth buildingWidth  Diff   Result
            //100        200           -100   < MIN  ** false
            //100        50            50     > MIN  ** pass
            //100        99            1      < MIN  ** false
            //100        101           -1     < MIN  ** false
            //100        98            2      == MIN ** pass

    		double diff = plotWidth - buildingWidth;

    		if (diff >= MINIMUMREQUIRED)
    			return true;
    		else
    			return false;
        }
        boolean checkLength(){
            // complete the missing block of codes

    		double diff = plotLength - buildingLength;

    		if (diff >= MINIMUMREQUIRED)
    			return true;
    		else
    			return false;
        }

    }

    // to display the plan is building plan is approved or not
    public void displayApproval(){
        Verification test = new Verification();
        approved = test.check();
        if(approved)
            System.out.println("Building plan Approved");
        else
            System.out.println("Building plan Rejected");
    }

    public static void main(String [] args){
        BuildingDevelopmentApplication application1 = new BuildingDevelopmentApplication(40,15,25,12);
        System.out.println("Application 1's status :");
        application1.displayApproval();

        BuildingDevelopmentApplication application2 = new BuildingDevelopmentApplication(40,15,23,13.1);
        System.out.println("Application 2's status :");

        application2.displayApproval();
    }

}
