@When("^[Ww]aiting for (\\d+) second[s]?$")
public void whenWaiting(int seconds) throws InterruptedException {
    // 0 should be allowed for optional waits
    if (seconds < 0) {
        throw new IllegalArgumentException(...);
    }
    Thread.sleep(TimeUnit.SECONDS.toMillis(seconds));
}