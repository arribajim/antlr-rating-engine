package mx.zurich.demo.rating;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;
import mx.zurich.demo.rating.calculator.CalculatorBaseVisitorImpl;
import mx.zurich.demo.rating.calculator.CalculatorLexer;
import mx.zurich.demo.rating.calculator.CalculatorParser;
import mx.zurich.demo.rating.engine.RatingEngineLexer;
import mx.zurich.demo.rating.engine.RatingEngineParser;
import mx.zurich.demo.rating.engine.RatingEngineVisitorImpl;
@Slf4j
@SpringBootApplication
public class DemoRatingEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRatingEngineApplication.class, args);
	}
	@Bean
	  public CommandLineRunner testCalculator() {
	    return new CommandLineRunner() {
	      @Override
	      public void run(String... args) throws Exception {
	    	  
	    	  
	  		log.info("ending......");
	  		
	  		 CharStream input = CharStreams.fromStream(new FileInputStream(new File("/tmp/demo-calc.gs")));
	  		 
	         CalculatorLexer lexer = new CalculatorLexer(input);
	         CommonTokenStream tokens = new CommonTokenStream(lexer);
	         CalculatorParser parser = new CalculatorParser(tokens);
	         ParseTree tree = parser.input();

	         CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
	         Double result = calcVisitor.visit(tree);
	    	 log.info("value "+result); 	
	    	 
	    	 CharStream inputS = CharStreams.fromString("return 4.5 ^ 6");
	    	 RatingEngineLexer rgLexer = new RatingEngineLexer(inputS);
	    	 CommonTokenStream rgtokens = new CommonTokenStream(rgLexer);
	    	 RatingEngineParser rgParser = new RatingEngineParser(rgtokens);
	    	 
	    	 
	    	 RatingEngineVisitorImpl rgVisitor = new RatingEngineVisitorImpl();
	    	 ParseTree tree1 = rgParser.parse();
	    	 
	    	 
	    	 log.info(" power " + rgVisitor.visit(tree1));

	      }
	    };
	  }
}
