package Lombok;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentLombok {
    private String name;
    private  Integer age;

    public void eat(@NonNull String food) {
        System.out.println(name + "εεεδΊ: " + food);
    }

}
