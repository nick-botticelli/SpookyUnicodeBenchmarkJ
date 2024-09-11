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

    @Benchmark
    public void unicodeToString_1c(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_3(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1d(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_4(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1e(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_5(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1f(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_6(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1g(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_7(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1h(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_8(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1i(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_9(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1j(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_10(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1k(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_11(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1l(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_12(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1m(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_13(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1n(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_14(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1o(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_15(UnicodeUtils.testStr1));
    }

    @Benchmark
    public void unicodeToString_1p(Blackhole bh) {
        bh.consume(StringEscapeUtils.unescapeJava(UnicodeUtils.testStr1));
    }



    @Benchmark
    public void unicodeToString_2a(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_1(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2b(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_2(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2c(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_3(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2d(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_4(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2e(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_5(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2f(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_6(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2g(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_7(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2h(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_8(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2i(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_9(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2j(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_10(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2k(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_11(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2l(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_12(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2m(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_13(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2n(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_14(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2o(Blackhole bh) {
        bh.consume(UnicodeUtils.unicodeToString_15(UnicodeUtils.testStr2));
    }

    @Benchmark
    public void unicodeToString_2p(Blackhole bh) {
        bh.consume(StringEscapeUtils.unescapeJava(UnicodeUtils.testStr2));
    }
}
