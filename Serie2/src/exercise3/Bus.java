package exercise3;

import java.util.Objects;

public class Bus {

    private int lineID;
    private String start;
    private String end;
    private int capacity;
    private int occupiedSeats;
    private int direction;
    private int stopsNumber;
    private int currentStop;

    public Bus(int lineID, String start, String end, int capacity, int stopsNumber) {
        this.lineID = lineID;
        this.start = start;
        this.end = end;
        this.capacity = capacity;
        this.direction = 1;
        this.stopsNumber = stopsNumber;
        this.currentStop = 1;
        this.occupiedSeats = 0;
    }

    public Bus(int lineID, String start, String end, int capacity, int occupiedSeats, int direction, int stopsNumber, int currentStop) {
        this.lineID = lineID;
        this.start = start;
        this.end = end;
        this.capacity = capacity;
        this.occupiedSeats = occupiedSeats;
        this.direction = direction;
        this.stopsNumber = stopsNumber;
        this.currentStop = currentStop;
    }

    public int getLineID() {
        return lineID;
    }

    public void setLineID(int lineID) {
        this.lineID = lineID;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOccupiedSeats() {
        return occupiedSeats;
    }

    public void setOccupiedSeats(int occupiedSeats) {
        this.occupiedSeats = occupiedSeats;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getStopsNumber() {
        return stopsNumber;
    }

    public void setStopsNumber(int stopsNumber) {
        this.stopsNumber = stopsNumber;
    }

    public int getCurrentStop() {
        return currentStop;
    }

    public void setCurrentStop(int currentStop) {
        this.currentStop = currentStop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return lineID == bus.lineID &&
                capacity == bus.capacity &&
                occupiedSeats == bus.occupiedSeats &&
                direction == bus.direction &&
                stopsNumber == bus.stopsNumber &&
                currentStop == bus.currentStop &&
                Objects.equals(start, bus.start) &&
                Objects.equals(end, bus.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineID, start, end, capacity, occupiedSeats, direction, stopsNumber, currentStop);
    }


    public void addTravellers(int number){
        if(this.getOccupiedSeats() + number < this.getCapacity()){
            this.setOccupiedSeats(this.getOccupiedSeats() + number);
        } else {
            this.setOccupiedSeats(this.getOccupiedSeats() + (this.getCapacity() - this.getOccupiedSeats()));
        }
    }

    public void removeTravellers(int number){
        if(this.getOccupiedSeats() - number >= 0){
            this.setOccupiedSeats(this.getOccupiedSeats() - number);
        } else {
            this.setOccupiedSeats(0);
        }
    }

    public void travel(){
        if ((this.getCurrentStop() == this.getStopsNumber()) || (this.getCurrentStop() == 1)){
            this.setDirection(-this.getDirection());
        }
        this.setCurrentStop(this.getDirection());
    }
}
