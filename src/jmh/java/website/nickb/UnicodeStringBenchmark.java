package website.nickb;

import org.apache.commons.text.StringEscapeUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class UnicodeStringBenchmark {
    @Benchmark
    public void unicodeToString_1a(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_1(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1b(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_2(UnicodeUtils.testStr1));
    }

//    @Benchmark
//    public void unicodeToString_1c(Blackhole bh) {
//        bh.consume(UnicodeUtils.unicodeToString_3(UnicodeUtils.testStr1));
//    }

    @Benchmark
    public void unicodeToString_1d(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_4(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1e(Blackhole bh) {
        bh.consume(StringEscapeUtils.unescapeJava(UnicodeUtils.testStr1));
    }



    @Benchmark
    public void unicodeToString_2a(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_1(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_2b(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_2(UnicodeUtils.testStr2));
    }

//    @Benchmark
//    public void unicodeToString_2c(Blackhole bh) {
//        bh.consume(UnicodeUtils.unicodeToString_3(UnicodeUtils.testStr2));
//    }

    @Benchmark
    public void unicodeToString_2d(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_4(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2e(Blackhole bh) {
        bh.consume(StringEscapeUtils.unescapeJava(UnicodeUtils.testStr2));
    }
}
