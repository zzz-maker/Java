package test4;

public class Game {
    private class Clips {
        public void moveDown() {
            System.out.println("Clips move down");
        }

        public void catches(Toy toy) {
            System.out.println("catch a " + toy.getColor() + "toy");
        }

        public void moveUp() {
            System.out.println("Clips move up");
        }
    }

    private class Toy {
        private String color;

        public Toy(String color) {
            super();
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }

    public void control(String color) {
        Clips clips = new Clips();
        clips.moveDown();
        clips.catches(new Toy(color));
        clips.moveUp();
    }
}
