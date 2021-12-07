package statemachine.seatheater;

public enum SeatHeaterState {
    OFF{
        public SeatHeaterState next(){
            return SeatHeaterState.HOT;
        }
    },HOT{
        public SeatHeaterState next(){
            return SeatHeaterState.WARM;
        }
    },
    WARM{
        public SeatHeaterState next(){
            return SeatHeaterState.TEPID;
        }
    },
    TEPID{
        public SeatHeaterState next(){
            return SeatHeaterState.OFF;
        }
    };

    public abstract SeatHeaterState next();
}