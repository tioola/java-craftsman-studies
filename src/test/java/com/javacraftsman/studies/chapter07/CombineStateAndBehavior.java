package com.javacraftsman.studies.chapter07;

public class CombineStateAndBehavior {

    /**
     * It is really common to see code that separate the state of the object from the behavior. this is really bad practice you
     * end up with anemic domains which does not have control over their state. Take the example below */

    class Car{
        private CarState carState = CarState.TURNED_OFF;

        public CarState getCarState() {
            return carState;
        }

        public void setCarState(CarState carState) {
            this.carState = carState;
        }
    }

    enum CarState{
        TURNED_ON,
        STANDBY,
        TURNED_OFF;
    }

    class CarService {

        public void turnCarOn(Car car){
            car.setCarState(CarState.TURNED_ON);
        }

        public void turnCarOff(Car car){
            car.setCarState(CarState.TURNED_OFF);
        }

    }


    /**
     * The example above is a really bad code. As you can see the car does not know how to turn it self we have another service
     * class which is responsible for doing to logic to change the car state. This is definately not a good choice. The class which should
     * be responsible for knowing that is car. In this example there is no complex logic but imagine if there were, you might end up having
     * cases where your code simply set the car state without executing the proper code.
     *
     * A good fix for it would be somethign like the example below:
     */


    class CorrectCar{
        private CarState carState = CarState.TURNED_OFF;

        public void turnCarOn(){
            this.carState=CarState.TURNED_ON;
        }

        public void turnCarOff(){
            this.carState = CarState.TURNED_OFF;
        }
    }

    //Ofc the code below would be better to be immutable but just to demonstrate.

}
