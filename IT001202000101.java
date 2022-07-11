import java.util.Scanner;

public class IT001202000101 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        int ShapesSelected;

        System.out.println("Choose the shape that you want to calculate: ");
        System.out.println("1 - Circle\n2 - Rectangle\n3 - Sphere\n4 - Cylinder\n5 - Cuboids\n6 - Rectangular Pyramids");
        ShapesSelected = input.nextInt();

        if(ShapesSelected == 1){
            Circle circle = new Circle();
            System.out.print("Please enter the radius of the circle: ");
            float r = input.nextFloat();
            circle.setRadius(r);
            System.out.print("The area of the circle: " + circle.getArea());
            System.out.print("\nThe perimeter of the circle: " + circle.getPerimeter());
        }

            else if(ShapesSelected == 2){
                Rectangle rectangle = new Rectangle();
                System.out.print("Please enter the length of the rectangle: ");
                float l = input.nextFloat();
                rectangle.setLength(l);
                System.out.print("Please enter the width of the rectangle: ");
                float w = input.nextFloat();
                rectangle.setWidth(w);
                System.out.print("The area of the rectangle: " + rectangle.getArea());
                System.out.print("\nThe perimeter of the rectangle: " + rectangle.getPerimeter());
            }
            
            else if(ShapesSelected == 3){
                Sphere sphere = new Sphere();
                System.out.print("Please enter the radius of the sphere: ");
                float r = input.nextFloat();
                sphere.setRadius(r);
                System.out.print("The surface area of the sphere: " + sphere.getArea());
                System.out.print("\nThe surface perimeter of the sphere: " + sphere.getPerimeter());
                System.out.print("\nThe volume of the sphere: " + sphere.getVolume());
            }

            else if(ShapesSelected == 4){
                Cylinder cylinder = new Cylinder();
                System.out.print("Please enter the radius of the cylinder: ");
                float r = input.nextFloat();
                cylinder.setRadius(r);
                System.out.print("Please enter the height of the cylinder: ");
                float h = input.nextFloat();
                cylinder.setHeight(h);
                System.out.print("The surface area of the cylinder: " + cylinder.getArea());
                System.out.print("\nThe base perimeter of the cylinder: " + cylinder.getPerimeter());
                System.out.print("\nThe volume of the cylinder: " + cylinder.getVolume());
            }

            else if(ShapesSelected == 5){
                Cuboids cuboids = new Cuboids();
                System.out.print("Please enter the length of the cuboids: ");
                float l = input.nextFloat();
                cuboids.setLength(l);
                System.out.print("Please enter the width of the cuboids: ");
                float w = input.nextFloat();
                cuboids.setWidth(w);
                System.out.print("Please enter the height of the cuboids: ");
                float h = input.nextFloat();
                cuboids.setHeight(h);
                System.out.print("The surface area of the cuboids: " + cuboids.getArea());
                System.out.print("\nThe surface perimeter of the cuboids: " + cuboids.getPerimeter());
                System.out.print("\nThe volume of the cuboids: " + cuboids.getVolume());
            }

            else if(ShapesSelected == 6){
                RectPyramid rectPyramid = new RectPyramid();
                System.out.print("Please enter the length of the rectangular pyramid: ");
                float l = input.nextFloat();
                rectPyramid.setLength(l);
                System.out.print("Please enter the width of the rectangular pyramid: ");
                float w = input.nextFloat();
                rectPyramid.setWidth(w);
                System.out.print("Please enter the height of the rectangular pyramid: ");
                float h = input.nextFloat();
                rectPyramid.setHeight(h);
                System.out.print("The surface area of the rectangular pyramid: " + rectPyramid.getArea());
                System.out.print("\nThe base perimeter of the rectangular pyramid: " + rectPyramid.getPerimeter());
                System.out.print("\nThe volume of the rectangular pyramid: " + rectPyramid.getVolume());
            }

        input.close();
    }        
}
