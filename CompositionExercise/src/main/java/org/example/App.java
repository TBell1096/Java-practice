package org.example;
public class App 
{
    public static void main( String[] args )
    {

       TerminalUtilities utils = new TerminalUtilities();
        System.out.println("Welcome to the Museum");
        boolean keepRunning = true;


                //enter artifact name
           String artifactName = utils.getArtifactName();

           //enter year discovered
           int discoveryYear = utils.getDiscoveryYear();


                //enter discoverer's first name
            String discovererFirstName = utils.getDiscovererFirstName();

            //enter the last name
            String discovererLastName = utils.getDiscovererLastName();

           //enter specialty
            String specialty = utils.getSpecialty();


            System.out.print("Is this person the curator? (y/n): ");
            String answer = utils.getString().toLowerCase();

            if (answer.equals("y")) {
               Person discoverer = new Person(discovererFirstName, discovererFirstName, specialty);
               Person curatorAndDiscoverer = discoverer;
                Artifact artifact = new Artifact(artifactName, discoveryYear, discoverer, curatorAndDiscoverer);
                utils.printMessage(artifact.toString());
            } else {
                String curatorFirstName = utils.getCuratorFirstName();
                String curatorLastName = utils.getCuratorLastName();
                String curatorSpecialty = utils.getSpecialty();
                Person discoverer = new Person(discovererFirstName, discovererLastName, specialty);
                Person curator = new Person(curatorFirstName, curatorLastName, curatorSpecialty);
                Artifact artifact = new Artifact(artifactName, discoveryYear, discoverer, curator);
                utils.printMessage(artifact.toString());
            }

    }
}
