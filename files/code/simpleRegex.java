@When("^instance \"([^\"]*)\" crashes$")
public void thenUplinkNetworkConsistsOf(String instanceId) {
    ...
}

@When("instance {string} crashes")
public void thenUplinkNetworkConsistsOf(String instanceId) {
    ...
}