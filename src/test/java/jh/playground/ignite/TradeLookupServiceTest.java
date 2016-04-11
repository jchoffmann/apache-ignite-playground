package jh.playground.ignite;

import jh.playground.ignite.api.TradeLookupService;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;

public class TradeLookupServiceTest {
    public static void main(String[] args) {
        Ignition.setClientMode(true);
        try (Ignite ignite = Ignition.start("examples/config/ironbridge/ib-client.xml")) {

            // Use trade lookup API
            TradeLookupService svc = ignite.services().serviceProxy("tradeService", TradeLookupService.class, true);
            String msg = String.format("Lookup up trade %d: %s", 1, svc.lookup(1));
            System.out.println(msg);
        }
    }
}
