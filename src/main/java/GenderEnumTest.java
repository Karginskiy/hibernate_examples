import javax.persistence.*;

public class GenderEnumTest {

    @Entity
    public static class Person
    {

        @Id
        private long id;

        private String name;

        @Convert( converter = GenderConverter.class )
        public Gender gender;

    }


    @Converter
    public static class GenderConverter implements AttributeConverter<Gender, Character>
    {

        public Character convertToDatabaseColumn(Gender gender) {
            if ( gender == null )
            {
                return null;
            }

            return gender.getCode();
        }

        public Gender convertToEntityAttribute(Character character) {
            if ( character == null )
            {
                return null;
            }

            return Gender.fromCode( character );
        }
    }


}
