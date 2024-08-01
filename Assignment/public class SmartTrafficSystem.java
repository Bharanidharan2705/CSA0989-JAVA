public class SmartTrafficSystem {
    public static void main(String[] args) {
       
        TrafficSensor sensor = new TrafficSensor(15, 25);
        TrafficSignal signal = new TrafficSignal("red", 10);

       
        optimizeSignal(sensor, signal);
        printSignalState(signal);
    }

    public static void optimizeSignal(TrafficSensor sensor, TrafficSignal signal) {
        if (sensor.getVehicleCount() > 10 && sensor.getSpeed() < 30) {
            signal.setState("green");
            signal.setDuration(30);
        } else if (sensor.getVehicleCount() > 5 && sensor.getSpeed() < 20) {
            signal.setState("yellow");
            signal.setDuration(20);
        } else {
            signal.setState("red");
            signal.setDuration(10);
        }
    }

    public static void printSignalState(TrafficSignal signal) {
        System.out.println("Signal State: " + signal.getState());
        System.out.println("Signal Duration: " + signal.getDuration() + " seconds");
    }
}

class TrafficSensor {
    private int vehicleCount;
    private int speed;

    public TrafficSensor(int vehicleCount, int speed) {
        this.vehicleCount = vehicleCount;
        this.speed = speed;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public int getSpeed() {
        return speed;
    }
}

class TrafficSignal {
    private String state;
    private int duration;

    public TrafficSignal(String state, int duration) {
        this.state = state;
        this.duration = duration;
    }

    public String getState() {
        return state;
    }

    public int getDuration() {
        return duration;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}