import 'package:flutter/material.dart';
import './native_view.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'PlatformView Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key, required this.title}) : super(key: key);
  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  bool usingHybridComposition = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Stack(
          children: <Widget>[
            Container(
              constraints: BoxConstraints.expand(height: 300),
              padding: const EdgeInsets.all(8.0),
              color: Colors.red[600],
              alignment: Alignment.center,
              child: NativeView(usingHybridComposition),
            ),
            Opacity(
              opacity: 0.85,
              child: Container(
                constraints: BoxConstraints.expand(
                  height:
                      Theme.of(context).textTheme.headline4!.fontSize! * 1.1 +
                          50.0,
                ),
                padding: const EdgeInsets.all(8.0),
                color: Colors.blue[600],
                alignment: Alignment.center,
                transform: Matrix4.rotationZ(0.2),
                child: Text('Flutter UI',
                    style: Theme.of(context)
                        .textTheme
                        .headline4!
                        .copyWith(color: Colors.white)),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
