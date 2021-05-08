package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("-------Strarting deployment of etsy app to AWS zones----------");
        String[] zonesToDeploy = zones.split(",");
        for (String eachZone : zonesToDeploy) {
            System.out.println(eachZone);
        }
        System.out.println("-------Deploying etsy to us-east-1----------");
        String[] zonesToDeploy2 = zones.split(",");
        for (String eachZone : zonesToDeploy2) {
            System.out.println("Deploying [" + app + "] to " + eachZone + "...");
            System.out.println("Deployments complete" + eachZone);

        }
    }
}

/*
Deploying etsy to us-east-1...
Deployment completed for us-east-1


Deploying etsy to us-west-1...
Deployment completed for us-west-1

Deploying etsy to us-west-2...
Deployment completed for us-west-2


---All deployments complete----
 */