package ObjectOrintedAssigments.HumanClassProject;

public class HumanMain {
        private final String language;
        private double height, weight;

        public HumanMain(String language) {
            this.language = language;
        }

        public HumanMain(String language, double height, double weight) {
            this.language = language;
            setHeight(height);
            setWeight(weight);
        }

        private void setHeight(double height) {
            if (height<=0){
                throw new IllegalArgumentException("Height must be above 0.");
//            System.out.println("Height must be above 0. height = " + this.height);
//            return;
            }
            this.height = height;
        }

        private void setWeight(double weight) {
            if (weight<=0){
                throw new IllegalArgumentException("Weight must be above 0.");
//            System.out.println("Weight must be above 0. weight = " + this.weight);
//            return;
            }
            this.weight = weight;
        }

        public String getLanguage() {
            return language;
        }

        public double getHeight() {
            return height;
        }

        public double getWeight() {
            return weight;
        }

        public void getAttributes() {
            System.out.println("Language = " + language + ", Height = " + height + ", Weight = " + weight);
        }
    }
