package co.uk.ticklethepanda.location.history.cartograph;

import co.uk.ticklethepanda.location.history.cartograph.points.latlong.LongLat;

public class GeodeticData<T> {

    private LongLat point;
    private T data;

    public GeodeticData(LongLat point, T data) {
        this.point = point;
        this.data = data;
    }

    public LongLat getPoint() {
        return point;
    }

    public T getData() {
        return data;
    }

}
