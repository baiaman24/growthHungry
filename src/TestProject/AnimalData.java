package TestProject;

// TODO SETUP THE CLASS
public class AnimalData {
    private String name;
    private String moveType;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 2) {
            this.name = name;
        }
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        switch (moveType.toLowerCase()){
            case "fly":
            case "swim":
            case "run":
            case "crawl":
            case "jump":
            this.moveType = moveType;
        }

    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        if(sound.length() > 1) {
            this.sound = sound;
        }
    }
    public void printSpeedAndGroup(double avgSpeed){

        if(avgSpeed < 0){
            System.out.println("Speed is invalid");
        } else{

            System.out.println("Average speep: " + avgSpeed);
            String group = "";
            if(avgSpeed >= 0 && avgSpeed <= 10){
               group = "SLOW";
            } else if(avgSpeed <= 20 ){
                group = "MEDIUM";
            } else if (avgSpeed  <= 30) {
                group = "FAST";
            } else{
                group = "SUPER FAST";
            }
            System.out.println("Animal group is: " + group);
        }
    }
    @Override
    public String toString(){
        return "AnimalData{name= '" + name + "', moveType='" + moveType +"', sound='" + sound + "'}";
    }


}



// *  - 'toString' method in the format: className{name='Name', moveType='MoveType', sound='sound'}
// *