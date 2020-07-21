package com.javacraftsman.studies.chapter05;

public class ExposeCauseInVariable {

    /**
     * We sometimes forget that classes are also variables. therefore we should consider to add variables which can be recoverd in a better way
     * for example lets say we have the classe below

     */

    class MalformedMessageException extends IllegalArgumentException {

        final String messageToUser;

        public MalformedMessageException(String message,String messageToUser, Throwable cause) {
            super(message, cause);
            this.messageToUser = messageToUser;
        }

        public MalformedMessageException(String messageToUser) {
            super();
            this.messageToUser = messageToUser;
        }

        public String getMessageToUser() {
            return messageToUser;
        }
    }

    /**
     * In the example above we are declaring a variable which can be used to get the information. so you can basically call the
     * getMessageToUser to recover this message.
     *
     * This is a simple example but you might have much more information which can be easily retrieved by your code and manipulated
     * or you treated correctly.
     */
}
