package softuniBlog.entity;

import javax.persistence.GenerationType;

public @interface GeneratedValue {
    GenerationType strategy();
}
