package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>About Me</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f0f0f0; padding: 20px; }");
        out.println("h1, h2, h3 { color: #333; }");
        out.println("p { color: #666; }");
        out.println("ul { list-style-type: disc; }");
        out.println("</style>");
        out.println("</head><body>");

        // About Me Section
        out.println("<h1>About Me</h1>");
        out.println("<p>Hi, I'm Dayana. Welcome to my website! I am excited to meet you. I am an extrovert currently pursuing my degree in B.Tech Artificial Intelligence and Data Science at RMK College. I am a data enthusiast who exercises daily to keep fit.</p>
        <p>I am a dedicated professional with a B.Tech in Artificial Intelligence and Data Science. My skills include proficiency in OOPS, Python, and SQL. I have a strong passion for utilizing data to drive intelligent decision-making and problem-solving in various industries. With a solid foundation in machine learning algorithms and data analysis techniques, I am eager to contribute my expertise to a dynamic team and continue expanding my knowledge in the field of artificial intelligence.</p>")
        // Projects Section
        out.println("<h2>Projects</h2>");
        out.println("<div style='background-color: #fff; padding: 10px; border-radius: 5px; margin-bottom: 20px;'>");
        out.println("<h3 style='color: #007bff;'>Fish Classification using CNN</h3>");
        out.println("<p>Developed a fish image recognition system using Convolutional Neural Networks (CNN). Achieved high accuracy rates in identifying fish species from images.</p>");
        out.println("<h3 style='color: #007bff;'>Disease Prediction through Symptoms</h3>");
        out.println("<p>Created a machine learning algorithm to predict diseases based on symptoms.</p>");
        out.println("<h3 style='color: #007bff;'>lung cancer Prediction through images</h3>");
        out.println("<p>Created a machine learning algorithm to predict cancer through imagesbased on alg cnn and cae.</p>");
        out.println("</div>");

        // Internships Section
        out.println("<h2>Internships</h2>");
        out.println("<div style='background-color: #fff; padding: 10px; border-radius: 5px; margin-bottom: 20px;'>");
        out.println("<h3 style='color: #007bff;'>Android Developer Intern, National Small Industries Corporation (NSIC), Jan 2023 - Feb 2023</h3>");
        out.println("<h3 style='color: #007bff;'>Machine Learning Intern, PANTECH SOLUTIONS, July 2023 - Aug 2023</h3>");
        out.println("</div>");

        // Skill Set Section
        out.println("<h2>Skill Set</h2>");
        out.println("<div style='background-color: #fff; padding: 10px; border-radius: 5px; margin-bottom: 20px;'>");
        out.println("<h3 style='color: #007bff;'>Hard Skills</h3>");
        out.println("<ul>");
        out.println("<li>C</li>");
        out.println("<li>HTML</li>");
        out.println("<li>CSS</li>");
        out.println("<li>Object-Oriented Programming (OOPS)</li>");
        out.println("<li>Operating Systems (OS)</li>");
        out.println("<li>SQL</li>");
        out.println("<li>Database Management Systems (DBMS)</li>");
        out.println("</ul>");
        out.println("<h3 style='color: #007bff;'>Soft Skills</h3>");
        out.println("<p>[Insert Soft Skills Here]</p>");
        out.println("<h3 style='color: #007bff;'>Tools</h3>");
        out.println("<p>[List Tools Here]</p>");
        out.println("</div>");

        // Languages Section
        out.println("<h2>Languages</h2>");
        out.println("<div style='background-color: #fff; padding: 10px; border-radius: 5px; margin-bottom: 20px;'>");
        out.println("<p style='color: #007bff;'>Tamil (Native proficiency)</p>");
        out.println("<p style='color: #007bff;'>English (Professional proficiency)</p>");
        out.println("</div>");

        out.println("</body></html>");
    }
}

// package servlets;

// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import java.io.IOException;

// @WebServlet("/hello")
// public class HelloServlet extends HttpServlet {
//     private static final long serialVersionUID = 1L;

//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         response.setContentType("text/html");
//         response.getWriter().println("<h1>Hello, welcome to my portfolio website!</h1>");
//     }
// }
