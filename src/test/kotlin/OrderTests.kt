import com.jetbrains.handson.httpapi.module
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.Test
import kotlin.test.assertEquals

class OrderRouteTests{
    @Test
    fun testGetOrder() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/order/2020-04-05-01").apply {
                assertEquals(
                    """{"number":"2020-04-05-01","contents":[{"item":"Ham Sandwich","amount":2,"price":5.5},{"item":"Water","amount":1,"price":1.5},{"item":"Beer","amount":3,"price":2.5},{"item":"Cookie","amount":1,"price":3.75}]}""",
                response.content)
            assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

}