
import java.util.ArrayList;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class PrimeList
 */
@WebServlet(description = "Find Primes Under Number", urlPatterns = { "/PrimeList" })
public class PrimeList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		int number = Integer.parseInt(request.getParameter("number"));
		ArrayList<Integer> primeList = new ArrayList<>();
		for(int i=0;i<number;i++) {
			if(isPrime(i))
				primeList.add(i);
		}
		request.setAttribute("primeList", primeList);
		request.getRequestDispatcher("primeList.jsp").forward(request, response);
		
		response.getWriter().close();
		
		
	}
		
		
		public static boolean isPrime(int num) {
			if(num <= 1)
				return false;
			
			for(int i=2;i<=(int) Math.sqrt(num);i++) {
				if(num%i == 0) {
					return false;
			}
			}
			
			return true;
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
