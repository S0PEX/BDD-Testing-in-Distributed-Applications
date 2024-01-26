@Given( "^(?:the )?(same )?(running )?instance[s]? \"([^\"]*)\"" +
        "using (?:the (default|legacy|base) build|build \"([^\"]*)\")" +
        "(?: with im master role \"([^\"]*)\")?$")
public void givenInstancesUsingBuild(String keepProfile, ...)
throws Exception{
    ...
}