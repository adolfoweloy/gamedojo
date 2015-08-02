package br.com.gamedojo.parser;

import br.com.gamedojo.parser.processor.EndOfMatchProcessor;
import br.com.gamedojo.parser.processor.InvalidProcessor;
import br.com.gamedojo.parser.processor.NewMatchProcessor;
import br.com.gamedojo.parser.processor.PlayerKillingProcessor;
import br.com.gamedojo.parser.processor.WorldKillingProcessor;


public class LogProcessor {

    public static LineProcessor getProcessor(String line) {

        for (Processor p : Processor.values()) {
            if (p.getLineProcessor().matches(line)) {
                return p.getLineProcessor();
            }
        }

        return Processor.INVALID.getLineProcessor();
    }

    enum Processor {

        NEW_MATCH(new NewMatchProcessor()),
        PLAYER_KILLING(new PlayerKillingProcessor()),
        WORLD_KILLING(new WorldKillingProcessor()),
        END_GAME(new EndOfMatchProcessor()),
        INVALID(new InvalidProcessor());

        private LineProcessor lineProcessor;

        private Processor(LineProcessor lineProcessor) {
            this.lineProcessor = lineProcessor;
        }

        public LineProcessor getLineProcessor() {
            return this.lineProcessor;
        }
    }

}
