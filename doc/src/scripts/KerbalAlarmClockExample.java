import krpc.client.Connection;
import krpc.client.RPCException;
import krpc.client.services.KerbalAlarmClock;
import krpc.client.services.KerbalAlarmClock.Alarm;
import krpc.client.services.KerbalAlarmClock.AlarmAction;
import krpc.client.services.KerbalAlarmClock.AlarmType;
import krpc.client.services.SpaceCenter;

import java.io.IOException;

public class KerbalAlarmClockExample {
    public static void main(String[] args) throws IOException, RPCException {
        Connection connection = Connection.newInstance("Kerbal Alarm Clock Example");
        KerbalAlarmClock kac = KerbalAlarmClock.newInstance(connection);
        Alarm alarm = kac.createAlarm(AlarmType.RAW, "My New Alarm", SpaceCenter.newInstance(connection).getUT() + 10);
        alarm.setNotes("10 seconds have now passed since the alarm was created.");
        alarm.setAction(AlarmAction.MESSAGE_ONLY);
        connection.close();
    }
}
