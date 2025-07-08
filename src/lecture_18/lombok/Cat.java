package lecture_18.lombok;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Data // @Getter @Setter @ToString @EqualsAndHashCode @RequiredArgsConstructor
public class Cat {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
