import java.util.*;
class Sorting {
    public static void main(String[] args) {
        Course c1 = new Course(101, "Java", 15000);
        Course c2 = new Course(102, "Python", 12000);
        Course c3 = new Course(103, "React", 15000);
        Course c4 = new Course(104, "SQL", 10000);
        Course c5 = new Course(105, "Angular", 12000);

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        courses.add(c5);
        System.out.println("Before sorting");
        for (Course c : courses) {
            System.out.println(c);
        }
        System.out.println("After sorting in ASC order of fee");
        sortcourse(courses, "ASC");
        System.out.println("After sorting in DESC order of fee");
        sortcourse(courses, "DESC");
        System.out.println("After sorting in ASC order of name");
        sortname(courses, "ASC");
    }

    private static void sortcourse(List<Course> courses, String order) {
        if (order.equals("ASC")) {
            Collections.sort(courses, new Comparator<Course>() {
                @Override
                public int compare(Course c1, Course c2) {
                    return Integer.compare(c1.fee, c2.fee);
                }
            });

        } else {
            Collections.sort(courses, new Comparator<Course>() {
                @Override
                public int compare(Course c1, Course c2) {
                    return Integer.compare(c2.fee, c1.fee);
                }
            });
        }
        for (Course c : courses) {
            System.out.println(c);
        }
    }
    private static void sortname(List<Course> courses, String order) {
        if (order.equals("ASC")) {
            Collections.sort(courses, new Comparator<Course>() {
                @Override
                public int compare(Course c1, Course c2) {
                    return c1.name.compareTo(c2.name);
                }
            });
        }
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}
