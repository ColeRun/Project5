package edu.guilford;

public abstract class Creature  implements Comparable<Creature> {

    String scientificName;
    String commonName;
    int avgWeight;
    int avglifespan;
    String diet;
    String habitat;
    String conservationStatus;
    

    public Creature(String scientificName, String commonName, int avgWeight, int avglifespan, String diet, String habitat) {
        this.scientificName = scientificName;
        this.commonName = commonName;
        this.avgWeight = avgWeight;
        this.avglifespan = avglifespan;
        this.diet = diet;
        this.habitat = habitat;
    }

    //make a method
    public void printCreature() {
        System.out.println("Scientific Name: " + scientificName);
        System.out.println("Common Name: " + commonName);
        System.out.println("Average Weight: " + avgWeight);
        System.out.println("Average Lifespan: " + avglifespan);
        System.out.println("Diet: " + diet);
        System.out.println("Habitat: " + habitat);
        System.out.println("Conservation Status: " + conservationStatus);
    }


    //method to determine conservationStatus
    public String conservationStatus() {
        if (avgWeight < 100) {
            conservationStatus = "Least Concern";
        } else if (avgWeight >= 100 && avgWeight < 200) {
            conservationStatus = "Near Threatened";
        } else if (avgWeight >= 200 && avgWeight < 300) {
            conservationStatus = "Vulnerable";
        } else if (avgWeight >= 300 && avgWeight < 400) {
            conservationStatus = "Endangered";
        } else if (avgWeight >= 400 && avgWeight < 500) {
            conservationStatus = "Critically Endangered";
        } else if (avgWeight >= 500 && avgWeight < 600) {
            conservationStatus = "Extinct in the Wild";
        } else if (avgWeight >= 600) {
            conservationStatus = "Extinct";
        }
        return conservationStatus;
    }
    //create a compareTo method to order the weight of the objects
    public int compareTo(Creature creature) {
        if (this.avgWeight < creature.avgWeight) {
            return -1;
        } else if (this.avgWeight > creature.avgWeight) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public abstract void  noiseMade();

    

    //make a subclass called SandCat
   
    //subclass called Canine
  
    //subclass called Primate
  
}


