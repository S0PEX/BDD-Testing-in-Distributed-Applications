...
When    starting instances "Client1, Client2, Uplink" in the given order 
And     waiting for 5 seconds
And     adding tool "common/TestTool" to "Client1"
And     executing command "components set-auth common/TestTool public"
        on "Client1"

Then    instance "Client2" should see these components:
        | Client1 (via userName/Client1_) | common/TestTool | local |