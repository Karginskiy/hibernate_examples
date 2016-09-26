import org.hibernate.annotations.Type;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;

import javax.persistence.Entity;
import javax.persistence.Id;

public class EnumWithCustomTypeTest {

    @Entity
    public static class Person
    {

        @Id
        private Long id;

        private String name;

        @Type( type = "GenderType" )
        public Gender gender;

    }

    public class GenderType extends AbstractSingleColumnStandardBasicType<Gender>
    {

        public static final GenderType INSTANCE = new GenderType();

    }

}
