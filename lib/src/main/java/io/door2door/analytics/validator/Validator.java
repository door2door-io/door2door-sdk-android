package io.door2door.analytics.validator;

import io.door2door.analytics.api.exception.ValidationException;
import io.door2door.analytics.api.model.Event;

/**
 * Class responsible for checking the validity of the models.
 */
public class Validator {

    /**
     * Checks if a given model is valid and throws an exception if it is not.
     *
     * @param event the model to validate.
     * @throws ValidationException in case the validation fails.
     */
    public void validate(Event event) throws ValidationException {
        if (event == null) {
            throw new ValidationException("Event", "The root event object can't be null");
        }
    }
}
