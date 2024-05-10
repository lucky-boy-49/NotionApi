package com.lucky.notionapi.enumerate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 代码语言枚举
 * @author jiahe
 */
@Getter
@RequiredArgsConstructor
public enum CodeLanguage {

    ABAP("abap"),
    ARDUINO("arduino"),
    BASH("bash"),
    BASIC("basic"),
    C("c"),
    CLOJURE("clojure"),
    COFFEESCRIPT("coffeescript"),
    CCC("c++"),
    CC("c#"),
    CSS("css"),
    DART("dart"),
    DIFF("diff"),
    DOCKER("docker"),
    ELIXIR("elixir"),
    ELM("elm"),
    ERLANG("erlang"),
    FLOW("flow"),
    FORTRAN("fortran"),
    FF("f#"),
    GHERKIN("gherkin"),
    GLSL("glsl"),
    GO("go"),
    GRAPHQL("graphql"),
    GROOVY("groovy"),
    HASKELL("haskell"),
    HTML("html"),
    JAVA("java"),
    JAVASCRIPT("javascript"),
    JSON("json"),
    JULIA("julia"),
    KOTLIN("kotlin"),
    LATEX("latex"),
    LISP("lisp"),
    LIVESCRIPT("livescript"),
    LUA("lua"),
    MAKEFILE("makefile"),
    MARKDOWN("markdown"),
    MARKUP("markup"),
    MATLAB("matlab"),
    MERMAID("mermaid"),
    NIX("nix"),
    OBJECTIVE_C("objective-c"),
    OCAML("ocaml"),
    PASCAL("pascal"),
    PERL("perl"),
    PHP("php"),
    PLAIN_TEXT("plain text"),
    POWERSHELL("powershell"),
    PROLOG("prolog"),
    PROTOBUF("protobuf"),
    PYTHON("python"),
    R("r"),
    REASON("reason"),
    RUBY("ruby"),
    RUST("rust"),
    SASS("sass"),
    SCALA("scala"),
    SCHEME("scheme"),
    SCSS("scss"),
    SHELL("shell"),
    SQL("sql"),
    SWIFT("swift"),
    TYPESCRIPT("typescript"),
    VB("vb.net"),
    VERILOG("verilog"),
    VHDL("vhdl"),
    VISUAL_BASIC("visual basic"),
    WEBASSEMBLY("webassembly"),
    XML("xml"),
    YAML("yaml"),
    MIXING("java/c/c++/c#");

    private final String languageName;

}
